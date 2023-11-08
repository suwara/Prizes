package ku.cs.prize.service;

import ku.cs.prize.entity.Profile;
import ku.cs.prize.repository.ProfileRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Profile getOneById(UUID id) {return profileRepository.findById(id).get();}
}
