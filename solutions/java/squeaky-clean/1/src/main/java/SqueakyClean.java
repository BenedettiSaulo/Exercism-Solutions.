class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder stringBuilder = new StringBuilder();

        boolean flNextUpCase = false;

        for (Character c: identifier.toCharArray()) {

            switch (c) {
                case ' ':
                    stringBuilder.append("_");
                    break;
                case '-':
                    flNextUpCase = true;
                    break;
                case '4':
                    stringBuilder.append("a");
                    break;
                case '3':
                    stringBuilder.append("e");
                    break;
                case '0':
                    stringBuilder.append("o");
                    break;
                case '1':
                    stringBuilder.append("l");
                    break;
                case '7':
                    stringBuilder.append("t");
                    break;
                default:

                    boolean isLetter = ('a' <= c && c <= 'z' ) || ('A' <= c && c <= 'Z');
                    
                    if (!isLetter) {
                        break;
                    }
                    
                    if (!flNextUpCase) {
                        stringBuilder.append(c.toString());
                        break;
                    }

                    stringBuilder.append(c.toString().toUpperCase());
    				flNextUpCase = false;
    				break;
            }
        }

        return stringBuilder.toString();
    }
}
