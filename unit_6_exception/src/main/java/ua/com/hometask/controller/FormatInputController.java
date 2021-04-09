package ua.com.hometask.controller;

public class FormatInputController extends FormatController {

    @Override
    public void execute(int numberFormat){
        switch (numberFormat){
            //1) 01/12/21 00:21:11:21
            case 1: {
                break;
            }
            //2) 11/28/2021 00:21:11:21
            case 2: {
                break;
            }
            //3) Март 4 21 00:21:11:21
            case 3: {
                break;
            }
            //4) 09 Апрель 789 21:45:23:21
            case 4: {
                break;
            }
        }
    }

}
