package week19.stream_tasks.service;

import static org.junit.jupiter.api.Assertions.*;
import static week19.stream_tasks.service.Implementation.countCourses;
import static week19.stream_tasks.service.Implementation.countCoursesByStatus;
import static week19.stream_tasks.service.Implementation.divideToWeek;
import static week19.stream_tasks.service.Implementation.findCoursesByUserId;
import static week19.stream_tasks.service.Implementation.findFirstWithFirstName;
import static week19.stream_tasks.service.Implementation.getMinMaxCourseDuration;
import static week19.stream_tasks.service.Implementation.groupOfCourseAssigned;
import static week19.stream_tasks.service.Implementation.partitionOfConfirmedUsers;
import static week19.stream_tasks.service.Implementation.readAllAdmins;
import static week19.stream_tasks.service.Implementation.readAllConfirmedUsers;
import static week19.stream_tasks.service.Implementation.readAllManagers;
import static week19.stream_tasks.service.Implementation.readAllPendingUsers;
import static week19.stream_tasks.service.Implementation.readAllStudents;
import static week19.stream_tasks.service.Implementation.readAllSuspendedUsers;
import static week19.stream_tasks.service.Implementation.sumDurationForAllData;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import week19.stream_tasks.model.Course;
import week19.stream_tasks.model.CourseStatus;

class ImplementationTest {

  @Test
  void testReadAllStudents() {
    assertEquals(8, readAllStudents().size());
  }

  @Test
  void testReadAllAdmins() {
    assertEquals(1, readAllAdmins().size());
  }

  @Test
  void testReadAllManagers() {
    assertEquals(2, readAllManagers().size());
  }

  @Test
  void testReadAllSuspendedUsers() {
    assertEquals(3, readAllSuspendedUsers().size());
  }

  @Test
  void testReadAllConfirmedUsers() {
    assertEquals(7, readAllConfirmedUsers().size());
  }

  @Test
  void testReadAllPendingUsers() {
    assertEquals(1, readAllPendingUsers().size());
  }

  @Test
  void testCountCourses() {
    assertEquals(Optional.of(7L).get(), countCourses());
  }

  @Test
  void testSumDurationForAllData() {
    assertEquals(Optional.of(9711).get(), sumDurationForAllData());
  }

  @Test
  void testFindCoursesByUserId() {
    List<String> coursesList = findCoursesByUserId(5).stream().map(Course::getName).collect(Collectors.toList());
    assertEquals(coursesList, Arrays.asList("Algorithm and data structures", "Java Become a web developer"));
  }

  @Test
  void testDivideToWeek() {
    assertEquals(Optional.of(61).get(), divideToWeek(5));
  }

  @Test
  void testCountCoursesByStatus() {
    Map<CourseStatus, Long> expectedMap = Map.of(
        CourseStatus.IN_PROGRESS, 4L,
        CourseStatus.NOT_STARTED, 3L,
        CourseStatus.FINISHED, 16L
    );
    assertEquals(expectedMap, countCoursesByStatus());
  }

  @Test
  void testGetMinMaxCourseDuration() {
    Map<String, Integer> expectedMap = Map.of("Max Duration", 2183, "Min Duration", 760);
    assertEquals(expectedMap, getMinMaxCourseDuration());
  }

  @Test
  void testFindFirstWithFirstName() {
    assertEquals("John", findFirstWithFirstName().getFirstName());
  }

  @Test
  void testFindAnyWithLastName() {
    NoSuchElementException noSuchElementException = assertThrows(NoSuchElementException.class, Implementation::findAnyWithLastName);
    assertEquals("No user exists", noSuchElementException.getMessage());

  }

  @Test
  void testPartitionOfConfirmedUsers() {
    List<Integer> sizes = partitionOfConfirmedUsers().values().stream()
        .map(List::size).collect(Collectors.toList());

    assertEquals(Arrays.asList(4,7),sizes);
  }

  @Test
  void testGroupOfCourseAssigned() {
    List<Integer> sizes = groupOfCourseAssigned().values().stream()
        .map(List::size).sorted().collect(Collectors.toList());
    assertEquals(List.of(3,4,16), sizes);
  }
}