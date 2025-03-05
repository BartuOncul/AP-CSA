public class TroublesomeKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pressedKeys = scanner.nextLine();
        String displayedLetters = scanner.nextLine();
        
        char sillyKey = '\0';
        char wrongLetter = '\0';
        char quietKey = '\0';
        
        for (int i = 0; i < pressedKeys.length(); i++) {
            char pressed = pressedKeys.charAt(i);
            char displayed = displayedLetters.charAt(i);
            
            if (pressed != displayed) {
                sillyKey = pressed;
                wrongLetter = displayed;
                break;
            }
        }
        
        for (int i = 0; i < pressedKeys.length(); i++) {
            char pressed = pressedKeys.charAt(i);
            if (!displayedLetters.contains(String.valueOf(pressed))) {
                quietKey = pressed;
                break;
            }
        }
        
        System.out.println(sillyKey + " " + wrongLetter);
        System.out.println(quietKey == '\0' ? "-" : quietKey);
        
        scanner.close();
    }
}
