package main.asm6;

import java.util.ArrayList;
import java.util.Comparator;


public class PhoneBook extends Phone {
    ArrayList<PhoneNumber> phoneList = new ArrayList<>();


    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber value : phoneList) {
            if (value.getName().equals(name)) {
                if (!value.getPhones().contains(phone)) {
                    value.getPhones().add(phone);
                    System.out.println("Da them so dien thoai moi cho " + name);
                }
                return;
            }
        }
        phoneList.add(new PhoneNumber(name, phone));
    }

    @Override
    public void removePhone(String name) {
        phoneList.removeIf(value -> value.getName().equals(name));
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        boolean flag = false;
        for (PhoneNumber value : phoneList) {
            if (value.getName().equals(name)) {
                value.getPhones().clear();
                value.getPhones().add(newPhone);
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Khong tim thay ten nguoi dung.");
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber value : phoneList) {
            if (value.getName().equals(name)) {
                System.out.println("So dien thoai cua nguoi dung " + name + " la " + value.getPhones());
                return;
            }
        }
        System.out.println("Khong tim thay nguoi dung " + name);
    }

    @Override
    public void sort() {
        phoneList.sort(Comparator.comparing(PhoneNumber::getName));
    }

}
