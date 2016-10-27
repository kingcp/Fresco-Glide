package com.example.administrator.fresco_glide.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/10/26.
 */
public class AllareasRankInfo {
    /**
     * note : 统计3日内新投稿的数据综合得分，每十分钟更新一次。
     * code : 0
     * pages : 1
     * num : 100
     * list : [{"aid":6481205,"typename":"综合","title":"【呜喵王ACG】52-一拳超人第二季，骨傲天剧场版","subtitle":"","play":241163,"review":1,"video_review":2219,"favorites":8101,"mid":346059,"author":"小M呜喵王","description":"ACG资讯类杂谈","create":"2016-10-01 12:35","pic":"http://i1.hdslb.com/bfs/archive/6a2d493a6d4baaadadd4eee21ae63e1d5d8472a9.jpg_320x200.jpg","coins":6113,"duration":"11:28","badgepay":false,"pts":293794}]*/

    private RankBean rank;

    public RankBean getRank()
    {

        return rank;
    }

    public void setRank(RankBean rank)
    {

        this.rank = rank;
    }

    public static class RankBean
    {

        private String note;

        private int code;

        private int pages;

        private int num;

        /**
         * aid : 6481205
         * typename : 综合
         * title : 【呜喵王ACG】52-一拳超人第二季，骨傲天剧场版
         * subtitle :
         * play : 241163
         * review : 1
         * video_review : 2219
         * favorites : 8101
         * mid : 346059
         * author : 小M呜喵王
         * description : ACG资讯类杂谈
         * create : 2016-10-01 12:35
         * pic : http://i1.hdslb.com/bfs/archive/6a2d493a6d4baaadadd4eee21ae63e1d5d8472a9.jpg_320x200.jpg
         * coins : 6113
         * duration : 11:28
         * badgepay : false
         * pts : 293794
         */

        private List<ListBean> list;

        public String getNote()
        {

            return note;
        }

        public void setNote(String note)
        {

            this.note = note;
        }

        public int getCode()
        {

            return code;
        }

        public void setCode(int code)
        {

            this.code = code;
        }

        public int getPages()
        {

            return pages;
        }

        public void setPages(int pages)
        {

            this.pages = pages;
        }

        public int getNum()
        {

            return num;
        }

        public void setNum(int num)
        {

            this.num = num;
        }

        public List<ListBean> getList()
        {

            return list;
        }

        public void setList(List<ListBean> list)
        {

            this.list = list;
        }

        public static class ListBean
        {

            private int aid;

            private String typename;

            private String title;

            private String subtitle;

            private String play;

            private int review;

            private int video_review;

            private int favorites;

            private int mid;

            private String author;

            private String description;

            private String create;

            private String pic;

            private int coins;

            private String duration;

            private boolean badgepay;

            private int pts;

            public int getAid()
            {

                return aid;
            }

            public void setAid(int aid)
            {

                this.aid = aid;
            }

            public String getTypename()
            {

                return typename;
            }

            public void setTypename(String typename)
            {

                this.typename = typename;
            }

            public String getTitle()
            {

                return title;
            }

            public void setTitle(String title)
            {

                this.title = title;
            }

            public String getSubtitle()
            {

                return subtitle;
            }

            public void setSubtitle(String subtitle)
            {

                this.subtitle = subtitle;
            }

            public String getPlay()
            {

                return play;
            }

            public void setPlay(String play)
            {

                this.play = play;
            }

            public int getReview()
            {

                return review;
            }

            public void setReview(int review)
            {

                this.review = review;
            }

            public int getVideo_review()
            {

                return video_review;
            }

            public void setVideo_review(int video_review)
            {

                this.video_review = video_review;
            }

            public int getFavorites()
            {

                return favorites;
            }

            public void setFavorites(int favorites)
            {

                this.favorites = favorites;
            }

            public int getMid()
            {

                return mid;
            }

            public void setMid(int mid)
            {

                this.mid = mid;
            }

            public String getAuthor()
            {

                return author;
            }

            public void setAuthor(String author)
            {

                this.author = author;
            }

            public String getDescription()
            {

                return description;
            }

            public void setDescription(String description)
            {

                this.description = description;
            }

            public String getCreate()
            {

                return create;
            }

            public void setCreate(String create)
            {

                this.create = create;
            }

            public String getPic()
            {

                return pic;
            }

            public void setPic(String pic)
            {

                this.pic = pic;
            }

            public int getCoins()
            {

                return coins;
            }

            public void setCoins(int coins)
            {

                this.coins = coins;
            }

            public String getDuration()
            {

                return duration;
            }

            public void setDuration(String duration)
            {

                this.duration = duration;
            }

            public boolean isBadgepay()
            {

                return badgepay;
            }

            public void setBadgepay(boolean badgepay)
            {

                this.badgepay = badgepay;
            }

            public int getPts()
            {

                return pts;
            }

            public void setPts(int pts)
            {

                this.pts = pts;
            }
        }
    }}
