package net.davidtanzer.babysteps;

import javax.swing.*;

public class StartCommand extends BabyStepCommandBase {

    public StartCommand(){

    }

    @Override
    public void excecute(JFrame timerFrame, JTextPane timerPane) {
        timerFrame.setAlwaysOnTop(true);
        timerPane.setText(BabyStepCommandBase.createTimerHtml(BabystepsTimer.getRemainingTimeCaption(0L), BACKGROUND_COLOR_NEUTRAL, true));
        timerFrame.repaint();
        new BabystepsTimer.TimerThread().start();
    }


}
