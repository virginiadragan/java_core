package poo_basic.linkedLists;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Task1 {

    public boolean isOrderedIt (LinkedList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean isOrderedRec (LinkedList<Integer> list, int idx) {

        if (idx < 2) {
            return true;
        }
        if (list.get(idx - 2) > list.get(idx - 1)) {
            return false;
        }

        return isOrderedRec(list, idx - 1);
    }

    public void searchElmIt (LinkedList<Integer> list, int elm) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) < elm && list.get(i) > elm) {
                System.out.println("Element " + elm + " doesn't exist");
                break;
            }

            if (list.get(i - 1) == elm) {
                System.out.println("Element " + elm + " exist");
            }
        }
    }

    public void searchElmRec (LinkedList<Integer> list, int elm, int idx) {

        if (idx > list.size() - 1) {
            return;
        }

        if (list.get(idx - 1) < elm && list.get(idx) > elm) {
            System.out.println("Element " + elm + " doesn't exist");
            return;
        }

        if (list.get(idx - 1) == elm) {
            System.out.println("Element " + elm + " exist");
            return;
        }

        searchElmRec(list, elm, idx + 1);
    }

    public LinkedList addElmIt (LinkedList<Integer> list, int elm) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) < elm && list.get(i) >= elm) {
                list.add(i, elm);
            }

            if (list.get(0) > elm) {
                list.add(0, elm);
            }
        }

        return list;
    }

    public LinkedList addElmRec (LinkedList<Integer> list, int elm, int idx) {
        if (idx > list.size() - 1) {
            return list;
        }

        if (list.get(idx - 1) < elm && list.get(idx) >= elm) {
            list.add(idx, elm);
        }

        if (list.get(0) > elm) {
            list.add(0, elm);
        }

        return addElmRec(list, elm, idx + 1);
    }

    public LinkedList removeElmIt (LinkedList<Integer> list, int elm) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == elm) {
                list.remove(i);
            }
        }

        return list;
    }

    public LinkedList removeElmRec (LinkedList<Integer> list, int elm, int idx) {
        if (idx > list.size() - 1) {
            return list;
        }

        if (list.get(idx) == elm) {
            list.remove(idx);
            return list;
        }

        return removeElmRec(list, elm, idx + 1);
    }
}
