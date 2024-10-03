package org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.buttonPressedEvent;

import com.qualcomm.robotcore.hardware.Gamepad;

import java.util.ArrayList;
import java.util.List;

public class ButtonPressedEventSource {
    private final List<ButtonPressedEventListener> listeners = new ArrayList<>();
    private boolean[] buttons;
    public ButtonPressedEventSource(){}
    public void addButtonPressedEventListener(ButtonPressedEventListener listener) {
        listeners.add(listener);
    }
    public void removeButtonPressedEventListener(ButtonPressedEventListener listener) {
        listeners.remove(listener);
    }
    public void checkButtonsPressed(Gamepad gamepad){
        buttons = new boolean[]{
                gamepad.a,
                gamepad.b,
                gamepad.x,
                gamepad.y,

                gamepad.dpad_up,
                gamepad.dpad_down,
                gamepad.dpad_left,
                gamepad.dpad_right,

                gamepad.guide,
                gamepad.start,
                gamepad.back,

                gamepad.left_stick_button,
                gamepad.right_stick_button,

                gamepad.left_bumper,
                gamepad.right_bumper
        };
       if(buttons[14]){
           ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,14);
           for(ButtonPressedEventListener listener : listeners){
               listener.handleButtonPressed(buttonPressed);
           }
       }
        if(buttons[13]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,13);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[12]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,12);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[11]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,11);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[10]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,10);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[9]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,9);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[8]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,8);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[7]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,7);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[6]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,6);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[5]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,5);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[4]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,4);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[3]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,3);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[2]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,2);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[1]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,1);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
        if(buttons[0]){
            ButtonPressedEvent buttonPressed = new ButtonPressedEvent(this,0);
            for(ButtonPressedEventListener listener : listeners){
                listener.handleButtonPressed(buttonPressed);
            }
        }
    }
}
