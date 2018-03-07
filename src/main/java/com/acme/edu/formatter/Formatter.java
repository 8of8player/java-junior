package com.acme.edu.formatter;

import com.acme.edu.message.*;

public interface Formatter {
    String getEditedMsg(IntMessage msg);
    String getEditedMsg(ByteMessage msg);
    String getEditedMsg(StringMessage msg);
    String getEditedMsg(BooleanMessage msg);
    String getEditedMsg(ObjectMessage msg);
    String getEditedMsg(ArrayMessage msg);
    String getEditedMsg(MatrixMessage msg);
    String getEditedMsg(CharMessage msg);
}
