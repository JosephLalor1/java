import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;

public class SimpleLoadingScreen {
    public static void main(String[] args) {
        // Show loading screen
        showLoadingScreen();
        
        // Simulate some loading process
        performLoading();
        
        // Show main application
        showMainApplication();
    }
    
    private static void showLoadingScreen() {
        JWindow loadingWindow = new JWindow();
        
        // Create loading panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        // Add loading label
        JLabel loadingLabel = new JLabel("Loading... Please wait", JLabel.CENTER);
        loadingLabel.setFont(new Font("Arial", Font.BOLD, 16));
        loadingLabel.setForeground(Color.BLUE);
        
        // Add progress bar
        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true); // Animated progress bar
        progressBar.setStringPainted(true);
        progressBar.setString("Initializing...");
        
        panel.add(loadingLabel, BorderLayout.CENTER);
        panel.add(progressBar, BorderLayout.SOUTH);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        loadingWindow.getContentPane().add(panel);
        loadingWindow.setSize(300, 150);
        loadingWindow.setLocationRelativeTo(null); // Center on screen
        loadingWindow.setVisible(true);
        
        // Store reference to close later
        SwingUtilities.invokeLater(() -> {
            try {
                Thread.sleep(3000); // Show for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            loadingWindow.dispose();
        });
    }
    
    private static void performLoading() {
        // Simulate loading process
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private static void showMainApplication() {
        JFrame frame = new JFrame("Main Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new JLabel("Welcome to the Application!", JLabel.CENTER));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}