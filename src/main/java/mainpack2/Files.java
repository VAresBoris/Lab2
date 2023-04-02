package mainpack2;

public class Files extends AbstractFiles {

    private String form;

    public Files(String name, int size, String form) {
        super(name, size);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        if (form == null)
            throw new IllegalArgumentException("формат не должен быть пустой ссылкой");
        this.form = form;
    }

    public static class Documents extends Files {
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
    }

    public static class Images extends Files {
        private Scale scale;

        public Images(String name, int size, String form, Scale scale) {
            super(name, size, form);
            this.scale = scale;
        }
    }

    public static class Multimedia extends Files {
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
    }


    public static class Video extends Multimedia {
        private Scale scale;

        public Video(String name, int size, String form, String description, String duration, Scale scale) {
            super(name, size, form, description, duration);
            this.scale = scale;
        }
    }

    private void print() {
    }

    public static void printAll(Files[] files){
        for (Files f: files){
            f.print();
            System.out.println();
        }
    }

}



