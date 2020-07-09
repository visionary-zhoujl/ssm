package cn.ssm.pojo;

import java.util.Date;

public class Appointment {
    //图书ID
    private long bookId;

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentId=" + studentId +
                ", appointment=" + appointment +
                ", book=" + book +
                '}';
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Date getAppointment() {
        return appointment;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    //学号
    private long studentId;
    //预约时间
    private Date appointment;

    private Book book;
}
