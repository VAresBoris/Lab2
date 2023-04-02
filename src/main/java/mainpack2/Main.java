package mainpack2;

public class Main {
    public static void main(String[] args) {
        AbstractFiles[] files = new AbstractFiles[]{
        new Files.Documents("j110-lab2.pdf", 232125, "pdf", 2),
        new Files.Documents("j110-slides.pptx", 639616, "pptx", 8),
        new Files.Images("spb-map.png", 7030527, "image", new Scale(2048, 3072) ),
        new Files.Multimedia("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", "05:28"),
        new Files.Video("BackToTheFuture1.avi", 1470984192, "video", "Back to the future", "01:48:08", new Scale(640, 352))
       };

        printAll(files);
    }

    public static void printAll(AbstractFiles[] files){
        for (AbstractFiles f: files){
            f.print();
            System.out.println();
        }
    }
}


