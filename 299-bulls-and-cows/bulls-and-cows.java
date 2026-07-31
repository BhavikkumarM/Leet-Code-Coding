class Solution {
    public String getHint(String secret, String guess) {
        int[] match = new int[10]; // only digits 0-9
        int bull = 0;
        int cow = 0;

        for (int i = 0; i < guess.length(); i++) {
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);

            if (ch1 == ch2) {
                bull++;
            } else {
                int n1 = ch1 - '0';
                int n2 = ch2 - '0';

                // If guess digit was seen before in secret
                if (match[n1] < 0) cow++;
                // If secret digit was seen before in guess
                if (match[n2] > 0) cow++;

                match[n1]++;
                match[n2]--;
            }
        }

        return bull + "A" + cow + "B";
    }
}
