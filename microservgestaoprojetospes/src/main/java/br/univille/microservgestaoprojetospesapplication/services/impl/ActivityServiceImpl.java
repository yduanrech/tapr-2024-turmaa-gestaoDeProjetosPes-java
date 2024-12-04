package br.univille.microservgestaoprojetospesapplication.services.impl;

import org.springframework.stereotype.Service;

import br.univille.microservgestaoprojetospesapplication.entities.Activity;
import br.univille.microservgestaoprojetospesapplication.repositories.ActivityRepository;

@Service
public class ActivityServiceImpl extends GenericServiceImpl<Activity, ActivityRepository>
{
    ActivityRepository activityRepository;
    
    @Override
    public Activity update(String cdActivity, Activity activity)
    {
        var getActivity = activityRepository.findById(cdActivity);

        if(!getActivity.isPresent()) {
            throw new RuntimeException("Activity not found with id: " + cdActivity);
        }

        var oldActivity = getActivity.get();

        oldActivity.setActivityTitle(activity.getActivityTitle());
        activityRepository.save(oldActivity);
        return oldActivity;
    }

}