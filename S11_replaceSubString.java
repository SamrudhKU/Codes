class S11_replaceSubString {
    public static void main(String[] args) {
        String original  = "Hello World";
        String toReplace = "World";
        String toAdd = "Java";
        // String modifiedString = "";

        String[] originalArray = original.split(" ");
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i].equals(toReplace)) {
                originalArray[i] = toAdd;
            }
        }


        // if (!original.contains(toReplace)) {
        //     System.out.println("Replace string does'nt match");
        // } else {
        //     modifiedString = original.replace(toReplace,toAdd);
        // }
        // System.out.println(modifiedString);
    }
}