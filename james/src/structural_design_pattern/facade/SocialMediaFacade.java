package structural_design_pattern.facade;

public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.facebook.share();
    }
}