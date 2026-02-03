public class Student {

    private String id;
    private String name;
    private double score;

    public Student() {
        id = "";
        name = "";
        score = 0.0;
    }
    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    //  Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public String getRank() {
        if (score >= 8.0) {
            return "Giỏi";
        } else if (score >= 6.5) {
            return "Khá";
        } else {
            return "Trung bình";
        }
    }

    public String toString() {
        return "ID: " + id +
                " | Name: " + name +
                " | Score: " + score +
                " | Rank: " + getRank();
    }
}
