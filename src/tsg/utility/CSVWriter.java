package tsg.utility;

import tsg.objects.TestCase;

import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

public class CSVWriter {

    private static String path = "/testPlan/testSuite.csv";
    public static void ToCSV(List<Object> obj){
        try (PrintWriter writer = new PrintWriter(new File(path))) {

            StringBuilder sb = new StringBuilder();
            obj.stream().forEach(line->{
                sb.append(randomInt(10)*10000);
                sb.append(',');
                sb.append(randomInt(20)*10000);
                sb.append(',');
                ((TestCase)line).toStringList().stream().forEach(str -> {
                    sb.append(str);
                    sb.append(',');
                });

            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static Integer randomInt(Integer range){
        return Math.round((float)Math.random()*range);
    }
}
