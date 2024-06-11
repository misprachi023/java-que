class PlayingCat {
    void isCatPlaying(boolean x, int y) {
        if (x == true) {
            if (y >= 25 && y <= 45) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            if (y >= 25 && y <= 35) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }
        }
    }

    public static void main(String[] args) {
        PlayingCat obj = new PlayingCat();
        obj.isCatPlaying(true, 10);
        obj.isCatPlaying(false, 36);
        obj.isCatPlaying(false, 35);
    }
}