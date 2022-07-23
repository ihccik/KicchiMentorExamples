package week14;

import experimental.Dog;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class KicchiCustomList implements List<Dog> {

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<Dog> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(Dog dog) {
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Dog> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends Dog> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public Dog get(int index) {
    return null;
  }

  @Override
  public Dog set(int index, Dog element) {
    return null;
  }

  @Override
  public void add(int index, Dog element) {

  }

  @Override
  public Dog remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<Dog> listIterator() {
    return null;
  }

  @Override
  public ListIterator<Dog> listIterator(int index) {
    return null;
  }

  @Override
  public List<Dog> subList(int fromIndex, int toIndex) {
    return null;
  }
}
