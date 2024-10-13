package project10marks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
	public class HangmanGame extends JFrame implements ActionListener {
		private static final long serialVersionUID = 8747596352378689420L;
		private static final List<String> WORDS = Arrays.asList("MANGO", "APPLE", "", "CHERRY", "BANANA", "STRAWBERRY", "BLACKBERRY", "BLUEBERRY", "WATERMELON", "ICEAPPLE", "WOODAPPLE", "PINEAPPLE", "CUSTERDAPPLE");
	    private String selectedWord;
	    private StringBuilder currentGuess;
	    private int attemptsLeft;
	    
	    private JLabel wordLabel;
	    private JLabel attemptsLabel;
	    private JTextField guessField;
	    private JTextArea resultArea;

	    public HangmanGame() {
	        setTitle("Hangman Game");
	        setSize(400, 300);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        selectedWord = selectRandomWord();
	        currentGuess = new StringBuilder("_".repeat(selectedWord.length()));
	        attemptsLeft = 10;

	        wordLabel = new JLabel("Word: " + currentGuess);
	        attemptsLabel = new JLabel("Attempts left: " + attemptsLeft);
	        guessField = new JTextField(5);
	        JButton guessButton = new JButton("Guess");

	        resultArea = new JTextArea(5, 30);
	        resultArea.setEditable(false);

	        guessButton.addActionListener(this);

	        add(wordLabel);
	        add(attemptsLabel);
	        add(guessField);
	        add(guessButton);
	        add(new JScrollPane(resultArea));

	        setVisible(true);
	    }

	    private String selectRandomWord() {
	        Random random = new Random();
	        return WORDS.get(random.nextInt(WORDS.size()));
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String guess = guessField.getText().toUpperCase();
	        guessField.setText("");

	        if (guess.length() == 1) {
	            processGuess(guess.charAt(0));
	        }

	        updateGameDisplay();
	        checkGameStatus();
	    }

	    private void processGuess(char guess) {
	        if (selectedWord.indexOf(guess) >= 0) {
	            for (int i = 0; i < selectedWord.length(); i++) {
	                if (selectedWord.charAt(i) == guess) {
	                    currentGuess.setCharAt(i, guess);
	                }
	            }
	            resultArea.append(guess + " is correct!\n");
	        } else {
	            attemptsLeft--;
	            resultArea.append(guess + " is incorrect. Attempts left: " + attemptsLeft + "\n");
	        }
	    }

	    private void updateGameDisplay() {
	        wordLabel.setText("Word: " + currentGuess);
	        attemptsLabel.setText("Attempts left: " + attemptsLeft);
	    }

	    private void checkGameStatus() {
	        if (currentGuess.toString().equals(selectedWord)) {
	            resultArea.append("Congratulations! You've guessed the word: " + selectedWord + "\n");
	            resetGame();
	        } else if (attemptsLeft <= 0) {
	            resultArea.append("Game Over! The word was: " + selectedWord + "\n");
	            resetGame();
	        }
	    }

	    private void resetGame() {
	        selectedWord = selectRandomWord();
	        currentGuess = new StringBuilder("_".repeat(selectedWord.length()));
	        attemptsLeft = 6;
	        wordLabel.setText("Word: " + currentGuess);
	        attemptsLabel.setText("Attempts left: " + attemptsLeft);
	        resultArea.append("New game started!\n");
	    }


	public static void main(String[] args) {
		new HangmanGame();

	}

}
