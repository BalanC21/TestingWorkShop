package models;

public class Subject {
    private final String subjectId;
    private String title;
    private String description;
    private Assessment studentResult;

    public Subject(String subjectId, String title, String description, Assessment studentResult) {
        this.subjectId = subjectId;
        this.title = title;
        this.description = description;
        this.studentResult = studentResult;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Assessment getStudentResult() {
        return studentResult;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", studentResult=" + studentResult +
                '}';
    }
}
