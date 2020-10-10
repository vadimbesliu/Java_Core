 class Task4 {
    public static void main(String[] args) {
        int numbers=0;
        int letters=0;
        int spaces=0;
        int other=0;
        String asd="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char [] count=asd.toCharArray();
        for (int i=0;i<asd.length();i++){
            if(Character.isLetter(count[i]))
                letters++;
            else if (Character.isDigit(count[i]))
                numbers++;
            else if (Character.isSpaceChar(count[i])) {
                spaces++;
            }
            else other++;
        }
        System.out.println("Letters: "+letters);
        System.out.println("Spaces: "+spaces);
        System.out.println("Numbers: "+numbers);
        System.out.println("Others: "+other);
    }
}
