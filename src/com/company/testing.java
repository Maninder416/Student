        package com.company;
        import java.text.DecimalFormat;
        import java.text.SimpleDateFormat;
        import java.time.LocalDate;
        import java.time.chrono.ChronoLocalDate;
        import java.util.ArrayList;
        import java.util.Date;
        import java.util.List;
        import java.util.Scanner;
        public class testing {

            public double temp() {
                String grade="8";
                double fee=0;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                if(grade.equalsIgnoreCase("6")){
                    fee= 100 * 1.75;

                }else if(grade.equalsIgnoreCase("7")){
                    fee=(100 * 1.75)+(100 * 1.75)*0.35;
                }
                else if(grade.equalsIgnoreCase("8")){
                    fee=((100 * 1.75)+(100 * 1.75)*0.35)+(((100 * 1.75)+(100 * 1.75)*0.35)*0.35);
                }
                return Double.valueOf(decimalFormat.format(fee));
            }


            public static void main(String[] args) throws Exception {
                testing testing= new testing();
               // testing.temp();
                System.out.println(testing.temp());
            }
        }
