package com.mycompany.EntityBeans;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T21:09:24")
@StaticMetamodel(PublicVideo.class)
public class PublicVideo_ { 

    public static volatile SingularAttribute<PublicVideo, String> duration;
    public static volatile SingularAttribute<PublicVideo, Date> datePublished;
    public static volatile SingularAttribute<PublicVideo, String> youtubeVideoId;
    public static volatile SingularAttribute<PublicVideo, String> description;
    public static volatile SingularAttribute<PublicVideo, Integer> id;
    public static volatile SingularAttribute<PublicVideo, String> title;
    public static volatile SingularAttribute<PublicVideo, String> category;

}