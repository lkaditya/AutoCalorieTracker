package sg.edu.iss.app.model;

import java.time.LocalDate;

public class BarChartData {
    private LocalDate localDate;
    private double totalCalories;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BarChartData(Object data) {
        this.data = data;
    }

    public BarChartData(LocalDate localDate, double totalCalories) {
        this.localDate = localDate;
        this.totalCalories = totalCalories;
    }

    public BarChartData() {
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }
}
