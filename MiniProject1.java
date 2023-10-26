import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MiniProject1 {
	

    public static void main(String[] args) {
        JFrame frame = new JFrame("FOOD MENU");
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
		
		DefaultListModel<String> cartListModel = new DefaultListModel<>();
		JList<String> cartList = new JList<>(cartListModel);
        cartList.setPreferredSize(new Dimension(300, 500));
        
        // Define image icons
        ImageIcon IV1 = new ImageIcon("pavbhaji.jpg");
        ImageIcon IV2 = new ImageIcon("misalpav.jpg");
        ImageIcon IV3 = new ImageIcon("paneertikkamasala.jpeg");
        ImageIcon IV4 = new ImageIcon("cholebhature.jpg");
        ImageIcon IN1 = new ImageIcon("chickenbiryani.jpg");
        ImageIcon IN2 = new ImageIcon("chickenshawarma.jpeg");
        ImageIcon IN3 = new ImageIcon(" ");
        ImageIcon IN4 = new ImageIcon(" ");
        ImageIcon ID1 = new ImageIcon("coldcoffe.jpg");
        ImageIcon ID2 = new ImageIcon("pineapplejuice.jpg");
        ImageIcon ID3 = new ImageIcon("oreoshake.jpg");
        ImageIcon ID4 = new ImageIcon("strawberryjuice.jpg");

        // Create buttons with actions for panel p1
        JButton p1B1 = new JButton("Pav Bhaji - Rs.60", IV1);
        p1B1.setVerticalTextPosition(JButton.BOTTOM);
        p1B1.setHorizontalTextPosition(JButton.CENTER);

        JButton p1B2 = new JButton("Misal Pav - Rs.50", IV2);
        p1B2.setVerticalTextPosition(JButton.BOTTOM);
        p1B2.setHorizontalTextPosition(JButton.CENTER);

        JButton p1B3 = new JButton("Paneer Tikka Masala - Rs.70", IV3);
        p1B3.setVerticalTextPosition(JButton.BOTTOM);
        p1B3.setHorizontalTextPosition(JButton.CENTER);

        JButton p1B4 = new JButton("Chole Bhature - Rs.70", IV4);
        p1B4.setVerticalTextPosition(JButton.BOTTOM);
        p1B4.setHorizontalTextPosition(JButton.CENTER);

        p1B1.setBackground(Color.white);
        p1B2.setBackground(Color.white);
        p1B3.setBackground(Color.white);
        p1B4.setBackground(Color.white);

        // Add action listeners to the buttons in panel p1
        p1B1.addActionListener(e -> {
            cartListModel.addElement("Pav Bhaji - Rs.60"); // Add item to the cart
        });

        p1B2.addActionListener(e -> {
            cartListModel.addElement("Misal Pav - Rs.50"); // Add item to the cart
        });

        p1B3.addActionListener(e -> {
            cartListModel.addElement("Paneer Tikka Masala - Rs.70"); // Add item to the cart
        });

        p1B4.addActionListener(e -> {
            cartListModel.addElement("Chole Bhature - Rs.70"); // Add item to the cart
        });

        // Create buttons with actions for panel p2
        JButton p2B1 = new JButton("Chicken Biryani - Rs.90", IN1);
        p2B1.setVerticalTextPosition(JButton.BOTTOM);
        p2B1.setHorizontalTextPosition(JButton.CENTER);

        JButton p2B2 = new JButton("Chicken Shawarma - Rs.60", IN2);
        p2B2.setVerticalTextPosition(JButton.BOTTOM);
        p2B2.setHorizontalTextPosition(JButton.CENTER);

        JButton p2B3 = new JButton("Item 7 - Rs.110", IN3);
        p2B3.setVerticalTextPosition(JButton.BOTTOM);
        p2B3.setHorizontalTextPosition(JButton.CENTER);

        JButton p2B4 = new JButton("Item 8 - Rs.120", IN4);
        p2B4.setVerticalTextPosition(JButton.BOTTOM);
        p2B4.setHorizontalTextPosition(JButton.CENTER);

        p2B1.setBackground(Color.white);
        p2B2.setBackground(Color.white);
        p2B3.setBackground(Color.white);
        p2B4.setBackground(Color.white);

        // Add action listeners to the buttons in panel p2
        p2B1.addActionListener(e -> {
            cartListModel.addElement("Chicken Biryani - Rs.90"); // Add item to the cart
        });

        p2B2.addActionListener(e -> {
            cartListModel.addElement("Chicken Shawarma - Rs.60"); // Add item to the cart
        });

        p2B3.addActionListener(e -> {
            cartListModel.addElement("Item 7 - Rs.110"); // Add item to the cart
        });

        p2B4.addActionListener(e -> {
            cartListModel.addElement("Item 8 - Rs.120"); // Add item to the cart
        });

        // Create buttons with actions
        JButton b1 = new JButton("Cold Coffee - Rs.40", ID1);
        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setHorizontalTextPosition(JButton.CENTER);

        JButton b2 = new JButton("Pineapple Juice - Rs.30", ID2);
        b2.setVerticalTextPosition(JButton.BOTTOM);
        b2.setHorizontalTextPosition(JButton.CENTER);

        JButton b3 = new JButton("Oreo Shake - Rs.50", ID3);
        b3.setVerticalTextPosition(JButton.BOTTOM);
        b3.setHorizontalTextPosition(JButton.CENTER);
		
		JButton b4 = new JButton("StrawBerry Juice - Rs.50", ID4);
        b4.setVerticalTextPosition(JButton.BOTTOM);
        b4.setHorizontalTextPosition(JButton.CENTER);
		
		b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        // Create a DecimalFormat to format prices
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        b1.addActionListener(e -> {
            cartListModel.addElement("Cold Coffee - Rs.40"); // Add item to the cart
        });

        b2.addActionListener(e -> {
            cartListModel.addElement("Pineapple Juice - Rs.30"); // Add item to the cart
        });

        b3.addActionListener(e -> {
            cartListModel.addElement("Oreo Shake - Rs.50"); // Add item to the cart
        });
		
		b4.addActionListener(e -> {
            cartListModel.addElement("StrawBerry Juice - Rs.50"); // Add item to the cart
        });
        
		
        // Apply GridLayout to the buttons in panel p1
		p1.setLayout(new GridLayout(2, 2));
		p1.add(p1B1);
		p1.add(p1B2);
		p1.add(p1B3);
		p1.add(p1B4);
		// Apply GridLayout to the buttons in panel p2
		p2.setLayout(new GridLayout(2, 2));
		p2.add(p2B1);
		p2.add(p2B2);
		p2.add(p2B3);
		p2.add(p2B4);
        // Apply GridLayout to the buttons in the "DRINKS" panel
        p3.setLayout(new GridLayout(2, 2));
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
		p3.add(b4);
		
        // Create a clear button to clear the cart list
        JButton clearButton = new JButton("Clear Cart");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartListModel.clear(); // Clear the cart list
            }
        });

        // Create an icon button
        ImageIcon cartIcon = new ImageIcon("QRcode.jpg");
        JButton iconButton = new JButton(cartIcon);

        // Create a button to calculate and display the total price
        JButton totalPriceButton = new JButton("Total Price");
        JLabel totalPriceLabel = new JLabel("Total Price: Rs0.00");

        totalPriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calculate and update the total price
                double total = 0;
                for (int i = 0; i < cartListModel.size(); i++) {
                    String item = cartListModel.elementAt(i);
                    int priceStartIndex = item.lastIndexOf(".");
                    if (priceStartIndex != -1) {
                        double price = Double.parseDouble(item.substring(priceStartIndex + 1));
                        total += price;
                    }
                }

                totalPriceLabel.setText("Total Price: Rs" + decimalFormat.format(total));
            }
        });

        // Create a panel for cart-related components
        JPanel cartPanel = new JPanel();
        cartPanel.setLayout(new BoxLayout(cartPanel, BoxLayout.Y_AXIS));
        cartPanel.add(new JScrollPane(cartList));
        cartPanel.add(clearButton);

        // Create a panel for icon-related components
        JPanel iconPanel = new JPanel();
        iconPanel.setLayout(new BoxLayout(iconPanel, BoxLayout.Y_AXIS));
        iconPanel.add(iconButton);
        iconPanel.add(totalPriceButton);
        iconPanel.add(totalPriceLabel);

        // Create a panel to align cart and icon panels horizontally
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.add(cartPanel);
        mainPanel.add(iconPanel);

        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS)); // Vertical layout for the entire p4
        p4.add(mainPanel);

        tabbedPane.addTab("VEG", p1);
        tabbedPane.addTab("NON VEG", p2);
        tabbedPane.addTab("DRINKS", p3);
        tabbedPane.addTab("MY CART", p4);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
