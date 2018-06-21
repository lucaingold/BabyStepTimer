package net.davidtanzer.babysteps;

import javax.swing.*;

public abstract class BabyStepCommandBase implements BabyStepCommand {
    public abstract void excecute(JFrame timerFrame, JTextPane timerPane);

    protected static String createTimerHtml(final String timerText, final String bodyColor, final boolean running) {

        String timerHtml = "<html><body style=\"border: 3px solid #555555; background: "+bodyColor+"; margin: 0; padding: 0;\">" +
                "<h1 style=\"text-align: center; font-size: 30px; color: #333333;\">"+timerText+"</h1>" +
                "<div style=\"text-align: center\">";
        if(running) {
            timerHtml += "<a style=\"color: #555555;\" href=\"command://stop\">Stop</a> " +
                    "<a style=\"color: #555555;\" href=\"command://reset\">Reset</a> ";
        } else {
            timerHtml += "<a style=\"color: #555555;\" href=\"command://start\">Start</a> ";
        }
        timerHtml += "<a style=\"color: #555555;\" href=\"command://quit\">Quit</a> ";
        timerHtml += "</div>" +
                "</body></html>";
        return timerHtml;
    }
}