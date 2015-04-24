
package scores;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "_id",
    "student_id",
    "type",
    "score"
})
public class Scores {

    @JsonProperty("_id")
    private String Id;
    @JsonProperty("student_id")
    private int studentId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("score")
    private double score;

    /**
     * 
     * @return
     *     The Id
     */
    @JsonProperty("_id")
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The studentId
     */
    @JsonProperty("student_id")
    public int getStudentId() {
        return studentId;
    }

    /**
     * 
     * @param studentId
     *     The student_id
     */
    @JsonProperty("student_id")
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The score
     */
    @JsonProperty("score")
    public double getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    @JsonProperty("score")
    public void setScore(double score) {
        this.score = score;
    }

}
