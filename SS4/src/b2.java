public class b2 {

    public static void main(String[] args) {

        String description = "Sách lập trình JAVA, Kệ: A1-102, tình trạng cũ";

        if (description.contains("Kệ:")) {

            int viTriKe = description.indexOf("Kệ:") + 4;

            int viTriDauPhay = description.indexOf(",", viTriKe);

            String maViTri;
            if (viTriDauPhay != -1) {
                maViTri = description.substring(viTriKe, viTriDauPhay).trim();
            } else {
                maViTri = description.substring(viTriKe).trim();
            }

            String moTaMoi = description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Vị trí tìm thấy: " + maViTri);
            System.out.println("Mô tả mới: " + moTaMoi);

        } else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }
}
