public class Code {

    public String encoded;
    public String decoded;

    public void encode (String sentence){           // zakodowanie tekstu
        char[] s = sentence.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if(s[i] < 'A' && s[i] > 'Z'){
                break;
            } else {
                s[i] = (char) (65+((s[i]-62)%26));
            }
            encoded += s[i];
        }
        System.out.println(encoded);
    }

    public void decode (String sentence){           // odkodowanie tekstu
        char[] s = sentence.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if(s[i] < 'A' && s[i] > 'Z'){
                break;
            } else {
                s[i] = (char) (65+((s[i]-42)%26));
            }
            decoded += s[i];
        }
        System.out.println(decoded);
    }
}
