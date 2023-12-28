package J05055;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        ArrayList<VanDongVien> ds = new ArrayList<>();
        ArrayList<Integer> stt = new ArrayList<>();

        for (int i = 1; i <= t; i++) {
            String name = scanner.nextLine(), dob = scanner.nextLine(), start = scanner.nextLine(), end = scanner.nextLine();
            int age = 2021 - Integer.valueOf(dob.substring(6));
            String a[] = start.split(":"), b[] = end.split(":");
            int time = (Integer.valueOf(b[0]) - Integer.valueOf(a[0])) * 3600 + (Integer.valueOf(b[1]) - Integer.valueOf(a[1])) * 60 + Integer.valueOf(b[2]) - Integer.valueOf(a[2]);

            ds.add(new VanDongVien(i, name, start, end, age, time));
            stt.add(ds.get(i - 1).getThanhTich());
        }

        Collections.sort(stt);
        int res[] = new int[t], dem = 1;
        res[0] = 1;
        long tmp = stt.get(0);
        for (int i = 1; i < t; i++) {
            if (stt.get(i).equals(tmp)) {
                res[i] = res[i - 1];
                dem++;
            } else {
                dem++;
                res[i] = dem;
                tmp = stt.get(i);
            }
        }

        for (VanDongVien vanDongVien : ds) {
            int x = stt.indexOf(vanDongVien.getThanhTich());
            System.out.println(vanDongVien + " " + res[x]);
        }

        scanner.close();
    }
}

class VanDongVien {

    private String id, name, start, end;
    private int age, time, thanhTich, uuTien;

    public VanDongVien(int id, String name, String start, String end, int age, int time) {
        this.id = "VDV" + String.format("%02d", id);
        this.name = name;
        this.start = start;
        this.end = end;
        this.age = age;
        this.time = time;
        if (age >= 32) {
            this.thanhTich = time - 3;
            this.uuTien = 3;
        } else if (age >= 25) {
            this.thanhTich = time - 2;
            this.uuTien = 2;
        } else if (age >= 18) {
            this.thanhTich = time - 1;
            this.uuTien = 1;
        } else {
            this.thanhTich = time;
            this.uuTien = 0;
        }
    }

    public String getString(int l) {
        int x = (int) l / 3600;
        int y = (int) (l - x * 3600) / 60;
        int z = (int) (l - x * 3600 - y * 60);
        return String.format("%02d:%02d:%02d", x, y, z);
    }

    public int getThanhTich() {
        return thanhTich;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + this.getString(time) + " " + this.getString(uuTien) + " " + this.getString(thanhTich);
    }
}
