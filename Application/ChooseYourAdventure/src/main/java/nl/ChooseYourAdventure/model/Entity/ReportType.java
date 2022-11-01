package nl.ChooseYourAdventure.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReportType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int report_typeid;

    @NotNull
    private String type;
}