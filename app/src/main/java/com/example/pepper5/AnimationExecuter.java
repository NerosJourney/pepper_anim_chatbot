package com.example.pepper5;

import com.aldebaran.qi.sdk.QiContext;
import com.aldebaran.qi.sdk.builder.AnimateBuilder;
import com.aldebaran.qi.sdk.builder.AnimationBuilder;
import com.aldebaran.qi.sdk.object.actuation.Animate;
import com.aldebaran.qi.sdk.object.actuation.Animation;
import com.aldebaran.qi.sdk.object.conversation.BaseQiChatExecutor;

import java.util.List;

public class AnimationExecuter extends BaseQiChatExecutor {

    QiContext qiContext;

    public AnimationExecuter(QiContext qc) {
        super(qc);
        qiContext = qc;
    }

    @Override
    public void runWith(List<String> params) {
        Animation animation = AnimationBuilder.with(qiContext).withResources(R.raw.sugar).build();
        switch(params.get(0)) {
            case "pick up the sugar":
                animation = AnimationBuilder.with(qiContext).withResources(R.raw.sugar).build();
                break;
            case "pour the sugar":
                animation = AnimationBuilder.with(qiContext).withResources(R.raw.sugarpt2).build();
                break;
            case "pick up the milk":
                animation = AnimationBuilder.with(qiContext).withResources(R.raw.milk_0).build();
                break;
            case "pour the milk":
                animation = AnimationBuilder.with(qiContext).withResources(R.raw.milk_1).build();
                break;
            case "pick up the fruit":
                animation = AnimationBuilder.with(qiContext).withResources(R.raw.fruit_1).build();
                break;
            case "pour the fruit":
                animation = AnimationBuilder.with(qiContext).withResources(R.raw.fruit_2).build();
                break;
            default:
                break;
        }
        Animate animate = AnimateBuilder.with(qiContext).withAnimation(animation).build();

        animate.run();
    }

    @Override
    public void stop() {

    }
}
