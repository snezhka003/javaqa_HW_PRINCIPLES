public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 21;
        post.birthday.month = 3;
        post.birthday.year = 1987;
        post.name = "Артемий";
        post.passport = "1234 № 123456";
        post.patronymic = "Кантемирович";
        post.phone = "+7 (918)-123-85-45";
        post.surname = "Савельев";
        post.subscription = true;
    }
}
