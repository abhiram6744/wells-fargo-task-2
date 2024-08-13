public class Security {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String category;
        private String purchaseDate;
        private Double purchasePrice;
        private Integer quantity;

        @ManyToOne
        private Portfolio portfolio;

        // Default constructor
        public Security() {}

        // Parameterized constructor
        public Security(String name, String category, String purchaseDate, Double purchasePrice, Integer quantity, portfolio) {
            this.name = name;
            this.category = category;
            this.purchaseDate = purchaseDate;
            this.purchasePrice = purchasePrice;
            this.quantity = quantity;
            this.portfolio = portfolio;
        }

        // Getters and Setters
        public Long getId() { return id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }
        public String getPurchaseDate() { return purchaseDate; }
        public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }
        public Double getPurchasePrice() { return purchasePrice; }
        public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }
        public Integer getQuantity() { return quantity; }
        public void setQuantity(Integer quantity) { this.quantity = quantity; }
        public Portfolio getPortfolio() { return portfolio; }
        public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    }

}
