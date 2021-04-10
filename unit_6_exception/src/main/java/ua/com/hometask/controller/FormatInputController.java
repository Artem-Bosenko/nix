package ua.com.hometask.controller;

public class FormatInputController extends FormatController {

    @Override
    public String execute(int numberFormat){

        switch (numberFormat){
            //1) 01/12/21 00:21:11:21
            case 1:
                //2) 11/28/2021 00:21:11:21
            case 2: {
                return "\\d{0,2}/\\d{0,2}/\\d{0,4}\\s\\d{0,2}:\\d{0,2}:\\d{0,2}:\\d{0,2}";

            }
            //3) Март 4 21 00:21:11:21
            case 3: {
                return "(?:Январь|Февраль|Март|Апрель|Май|Июнь|Июль|Август|Сентябрь|Октябрь|Ноябрь|Декабрь)\\s\\d{0,2}\\s\\d{0,4}\\s\\d{0,2}:\\d{0,2}:\\d{0,2}:\\d{0,2}";

            }
            //4) 09 Апрель 789 21:45:23:21
            case 4: {
                return "\\d{0,2}\\s(?:Январь|Февраль|Март|Апрель|Май|Июнь|Июль|Август|Сентябрь|Октябрь|Ноябрь|Декабрь)\\s\\d{0,4}\\s\\d{0,2}:\\d{0,2}:\\d{0,2}:\\d{0,2}";

            }
            default: throw new RuntimeException("Invalid format");
        }
    }

}
