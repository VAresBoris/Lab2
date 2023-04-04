package mainpack2;

public class Files {

    public static class Documents extends AbstractFiles {
        private int page;

        public Documents(String name, int size, String form, int page) {
            super(name, size, form);
            this.page = page;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            if (page >= 0)
                throw new IllegalArgumentException("количество страниц не должно быть меньше или равно 0");
            this.page = page;
        }

        @Override
        public void print() {
            System.out.println(String.format("j110-lab2.pdf %s,", "232125") + " " + getForm() + ", " + getPage());
        }

        @Override
        protected String getDetails() {
            return null;
        }
    }

    public static class Images extends AbstractFiles {
        private Scale scale;

        public Images(String name, int size, String form, Scale scale) {
            super(name, size, form);
            this.scale = scale;
        }

        @Override
        public void print() {
            System.out.println(String.format("spb-map.png %s,", "1703527") + " " + getForm() + ", " + scale.getWidth() + "*" + scale.getHeight());
        }

        @Override
        protected String getDetails() {
            return null;
        }
    }

    public static class Multimedia extends AbstractFiles {
        private String description;
        private String duration;

        public Multimedia(String name, int size, String form, String description, String duration) {
            super(name, size, form);
            this.description = description;
            this.duration = duration;
        }

        public String getDescription() {
            return description;
        }

        public String getDuration() {
            return duration;
        }

        public void setDescription(String description) {
            if (description == null)
                throw new IllegalArgumentException("описание не должно быть пустой ссылкой");
            this.description = description;
        }


        public void setDuration(int time) {
            if (time <= 0)
                throw new IllegalArgumentException("Длительность не должно быть меньше или равно 0");
            this.duration = duration;
        }

        @Override
        public void print() {
            System.out.println(String.format("06-PrettyGirl.mp3 %s,", "7893454") + " " + getForm() + ", "
                    + getDescription() + ", " + getDuration());
        }

        @Override
        protected String getDetails() {
            return null;
        }
    }


    public static class Video extends Multimedia {
        private Scale scale;

        public Video(String name, int size, String form, String description, String duration, Scale scale) {
            super(name, size, form, description, duration);
            this.scale = scale;
        }

        @Override
        public void print() {
            System.out.println(String.format("BackToTheFuture1.avi %s,", "1470984192") + " " + getForm() + ", "
                    + getDescription() + ", " + getDuration() + ", " + scale.getWidth() + "*" + scale.getHeight());
        }
    }


}



