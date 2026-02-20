
public class Problem4 {
    public static String generateDescription(String title, String sku, String category, 
                                             String[] specs, String[] features, double price, double discount) {
        StringBuilder sb = new StringBuilder();
        
        // Title and SKU
        sb.append("<h1>").append(title).append("</h1>\n");
        sb.append("<p>SKU: ").append(new StringBuilder(sku).reverse().toString()).append("</p>\n"); // Reverse SKU for verification
        
        // Basic Info
        sb.append("<h2>Basic Information</h2>\n");
        sb.append("<p>Category: ").append(category).append("</p>\n");
        
        // Specs
        sb.append("<h2>Specifications</h2>\n<ul>\n");
        for (String spec : specs) {
            sb.append("<li>").append(spec).append("</li>\n");
        }
        sb.append("</ul>\n");
        
        // Features
        sb.append("<h2>Features</h2>\n<ul>\n");
        for (String feature : features) {
            // Replace 'cheap' with 'affordable'
            String formattedFeature = feature.replace("cheap", "affordable");
            sb.append("<li>").append(formattedFeature).append("</li>\n");
        }
        sb.append("</ul>\n");
        
        // Pricing
        double finalPrice = price - (price * discount / 100);
        sb.append("<h2>Pricing</h2>\n");
        sb.append("<p>Original Price: $").append(price).append("</p>\n");
        sb.append("<p>Discount: ").append(discount).append("%</p>\n");
        sb.append("<p>Final Price: $").append(String.format("%.2f", finalPrice)).append("</p>\n");
        
        // Availability
        sb.append("<p><strong>Availability: In Stock</strong></p>\n"); // Assuming In Stock
        
        // Special: Promotional Banner
        sb.insert(0, "<div class='banner'>Special Offer!</div>\n");
        
        return sb.toString();
    }

    public static void main(String[] args) {
        // Problem 4: E-Commerce Description
        String title = "Gaming Laptop";
        String sku = "GL12345";
        String category = "Electronics";
        String[] specs = {"Intel i7", "16GB RAM", "512GB SSD", "RTX 3060", "15.6 inch Screen"};
        String[] features = {"High performance", "RGB Keyboard", "Very cheap price", "Lightweight"};
        
        String description = generateDescription(title, sku, category, specs, features, 1200.00, 10.0);
        
        System.out.println(description);
        System.out.println("Total Length: " + description.length());
        
        // Reading time
        int wordCount = description.split("\\s+").length;
        double readingTime = wordCount / 200.0;
        System.out.printf("Estimated Reading Time: %.2f minutes\n", readingTime);
    }
}
