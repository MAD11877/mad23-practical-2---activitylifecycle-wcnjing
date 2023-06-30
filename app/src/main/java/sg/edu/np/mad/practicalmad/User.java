package sg.edu.np.mad.practicalmad;

import android.media.Image;

public class User {
    private boolean following;
    private String name;
    private String description;
    private int id;

    public User(String name, String description, boolean following, int id) {
        this.name = name;
        this.description = description;
        this.following = following;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }


}