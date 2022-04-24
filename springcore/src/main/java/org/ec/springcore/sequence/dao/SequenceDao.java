package org.ec.springcore.sequence.dao;

import org.ec.springcore.sequence.Sequence;

public interface SequenceDao {

    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
}
