class MicroBlog {
    public String truncate(String input) {
        //ASCII-> Characters == 1 byte so methods related take into account this information
        //UTF-8 takes from 1 to 4 bytes
        //UTF-16 takes from 2 to 4 bytes
        System.out.println(input.length());
        return input.substring(0,5);
    }

    public static void main(String[] args) {
        MicroBlog  microBlog = new MicroBlog();
        System.out.println(microBlog.truncate("❄🌡🤧🤒🏥"));
        System.out.println(microBlog.truncate("Samir"));
    }
}