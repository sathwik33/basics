package test3;


public class highest_lowest_number {
    public static void main(String[] args) {
        String input = "GeeksForGeeks";
        char[] try1 = input.toCharArray();
        char[] try2 = new char[try1.length];
        for (int i = try1.length - 1; i >= 0; i--)
            try2[(try1.length - 1) - i] = try1[i];
    }
    for(int j = 0; j<=(try1.length-1);j++)

    {
        if (try1[j] != try2[j]) {
            System.out.println("Not palindrome");
        }
    }
                if(j==(try1.length))
            System.out.println("Yes palindrome");
}
}
