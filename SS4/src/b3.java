import java.time.LocalDate;

public class b3 {

    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };
        long startSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        sb.append("Ngày tạo: ").append(LocalDate.now()).append("\n");

        for (String t : transactions) {
            sb.append("Giao dịch: ").append(t).append("\n");
        }

        long endSB = System.currentTimeMillis();
        long timeSB = endSB - startSB;

        long startStr = System.currentTimeMillis();

        String report = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        report += "Ngày tạo: " + LocalDate.now() + "\n";

        for (String t : transactions) {
            report += "Giao dịch: " + t + "\n";
        }

        long endStr = System.currentTimeMillis();
        long timeStr = endStr - startStr;

        System.out.println(sb.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeSB);
        System.out.println("Số thời gian thực thi đối với String: " + timeStr);
    }
}
