class Darts {
    int score(double xOfDart, double yOfDart) {
        double hypotenuse = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

        if (hypotenuse > 10) {
            return 0;
        } else if (hypotenuse > 5) {
            return 1;
        } else if (hypotenuse > 1) {
            return 5;
        } else {
            return 10;
        }
    }
}
