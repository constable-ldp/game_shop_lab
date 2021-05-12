package Product;

public enum Rating {
    PEGI3(3),
    PEGI7(7),
    PEGI12(12),
    PEGI16(16),
    PEGI18(18);

    private int ageRating;

    Rating(int ageRating) {
        this.ageRating = ageRating;
    }

    public int getAgeRating() {
        return this.ageRating;
    }
}


