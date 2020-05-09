package org.shoalcreek.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpecialExpandModel {

    private boolean expanded;
    private String question;
    private List<String> answers;
    private List<String> urls;
}
