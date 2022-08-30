package week15.TripPlanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import week15.TripPlanner.enums.EClub;
import week15.TripPlanner.enums.EDays;
import week15.TripPlanner.modals.City;
import week15.TripPlanner.modals.Driver;
import week15.TripPlanner.modals.Student;
import week15.TripPlanner.modals.Teacher;

public class Database {
  public static List<City> cities;


  static {
    cities = new ArrayList<>();
    cities.add(new City("Los Angeles", (byte) 0, (byte) 0));
    cities.add(new City("Las Vegas", (byte) 2, (byte) 2));
    cities.add(new City("Dallas", (byte) 8, (byte) 2));
    cities.add(new City("Nashville", (byte) 11, (byte) 3));
    cities.add(new City("Denver", (byte) 5, (byte) 4));
    cities.add(new City("Minneapolis", (byte) 6, (byte) 7));
    cities.add(new City("Chicago", (byte) 9, (byte) 7));
    cities.add(new City("New York", (byte) 13, (byte) 7));
    cities.add(new City("Washington", (byte) 1, (byte) 9));
    cities.add(new City("Vermont", (byte) 14, (byte) 9));
  }

  public static Map<String, Boolean> getSchedule() {
    Map<String, Boolean> schedule = new HashMap<>();
    Random random = new Random();
    schedule.put(EDays.MONDAY.name(), random.nextBoolean());
    schedule.put(EDays.TUESDAY.name(), random.nextBoolean());
    schedule.put(EDays.WEDNESDAY.name(), random.nextBoolean());
    schedule.put(EDays.THURSDAY.name(), random.nextBoolean());
    schedule.put(EDays.FRIDAY.name(), random.nextBoolean());
    schedule.put(EDays.SATURDAY.name(), random.nextBoolean());
    schedule.put(EDays.SUNDAY.name(), random.nextBoolean());

    return schedule;
  }

  public static List<Student> getStudents(){
    List<Student> students = new ArrayList<>();

    students.add(new Student("Nathan", getSchedule(), 56d));
    students.add(new Student("Maria", getSchedule(), 23d));
    students.add(new Student("Mike", getSchedule(), 11.75d));
    students.add(new Student("Natalie", getSchedule(), 0d));
    students.add(new Student("Sergiy", getSchedule(), 0d));
    students.add(new Student("Murtaza", getSchedule(), 0d));
    students.add(new Student("Ekaterina", getSchedule(), 20d));
    students.add(new Student("Yuliia", getSchedule(), 103d));
    students.add(new Student("Mehmet", getSchedule(), 54.50d));
    students.add(new Student("Yusuf", getSchedule(), 42d));
    students.add(new Student("Sumeye", getSchedule(), 99.75d));
    students.add(new Student("Glenio", getSchedule(), 345d));
    students.add(new Student("Sebastian", getSchedule(), 77d));
    students.add(new Student("Nina", getSchedule(), 56.50d));

    return students;
  }

  public static List<Teacher> getTeachers(){
    List<Teacher> teachers = new ArrayList<>();

    teachers.add(new Teacher("Ower", getSchedule(), 352d, Arrays.asList(EClub.FRATERNITY.name(), EClub.ARTISTS.name())));
    teachers.add(new Teacher("Otto", getSchedule(), 123.55d, Arrays.asList(EClub.TRAVELERS.name(), EClub.DIGITALS.name())));
    teachers.add(new Teacher("Matt", getSchedule(), 499.5d, Arrays.asList(EClub.TRAVELERS.name())));
    teachers.add(new Teacher("Musti", getSchedule(), 223d, Arrays.asList(EClub.DIGITALS.name())));
    teachers.add(new Teacher("John", getSchedule(), 164d, Arrays.asList(EClub.FRATERNITY.name(), EClub.TRAVELERS.name())));

    return teachers;
  }

  public static Driver getDriver(){
    return new Driver("Bruce Wills");
  }
}
