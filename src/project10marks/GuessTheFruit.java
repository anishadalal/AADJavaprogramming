package project10marks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GuessTheFruit extends JFrame implements ActionListener {
    private static final long serialVersionUID = 8747596352378689420L;
    private static final List<String> WORDS = Arrays.asList("MANGO", "APPLE", "CHERRY", "BANANA", "STRAWBERRY", "BLACKBERRY", "BLUEBERRY", "WATERMELON", "ICEAPPLE", "WOODAPPLE", "PINEAPPLE", "CUSTERDAPPLE");
    private String selectedWord;
    private StringBuilder currentGuess;
    private int attemptsLeft;
    
    private JLabel headingLabel;
    private JLabel wordLabel;
    private JLabel attemptsLabel;
    private JLabel letterCountLabel;  // New label for number of letters
    private JTextField guessField;
    private JTextArea resultArea;

    public GuessTheFruit() {
        setTitle("Fruit Guessing Game");
        setSize(400, 350);  // Increased size to accommodate new label
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Add heading label
        headingLabel = new JLabel("Guess the Fruit!");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        selectedWord = selectRandomWord();
        currentGuess = new StringBuilder("_".repeat(selectedWord.length()));
        attemptsLeft = 10;

        wordLabel = new JLabel("Word: " + formatCurrentGuess());
        attemptsLabel = new JLabel("Attempts left: " + attemptsLeft);
        letterCountLabel = new JLabel("It's a " + selectedWord.length() + "-letter word");  // Show number of letters
        guessField = new JTextField(10);
        JButton guessButton = new JButton("Guess");

        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        guessButton.addActionListener(this);

        // Add components to the frame
        add(headingLabel);           // Heading
        add(letterCountLabel);       // Number of letters
        add(wordLabel);              // Current word with spaces
        add(attemptsLabel);          // Attempts left
        add(guessField);             // Input field
        add(guessButton);            // Guess button
        add(new JScrollPane(resultArea)); // Result area

        setVisible(true);
    }

    private String selectRandomWord() {
        Random random = new Random();
        return WORDS.get(random.nextInt(WORDS.size()));
    }

    // Format the current guess to show spaces between letters
    private String formatCurrentGuess() {
        return currentGuess.toString().replace("", " ").trim(); // Add spaces between characters
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String guess = guessField.getText().toUpperCase();
        guessField.setText("");

        // Check if the input is a full word or a single letter
        if (guess.length() > 1) {
            processFullWordGuess(guess);
        } else if (guess.length() == 1) {
            processGuess(guess.charAt(0));
        } else {
            resultArea.append("Please enter a valid letter or word.\n");
        }

        updateGameDisplay();
        checkGameStatus();
    }

    private void processFullWordGuess(String guess) {
        if (selectedWord.equals(guess)) {
            resultArea.append("You're right! The word is: " + selectedWord + "\n");
            currentGuess = new StringBuilder(selectedWord); // Reveal the full word
            resetGame(); // Start a new game
        } else {
            attemptsLeft--;
            resultArea.append(guess + " is incorrect. Attempts left: " + attemptsLeft + "\n");
        }
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
        wordLabel.setText("Word: " + formatCurrentGuess()); // Update the display with spaces
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
        wordLabel.setText("Word: " + formatCurrentGuess());
        attemptsLabel.setText("Attempts left: " + attemptsLeft);
        letterCountLabel.setText("It's a " + selectedWord.length() + "-letter word");  // Reset letter count
        resultArea.append("New game started!\n");
    }

    public static void main(String[] args) {
        new GuessTheFruit();  // Instantiate GuessTheFruit class
    }
} 

