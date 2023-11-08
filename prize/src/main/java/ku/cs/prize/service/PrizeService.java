package ku.cs.prize.service;

import ku.cs.prize.entity.Prize;
import ku.cs.prize.model.PrizeRequest;
import ku.cs.prize.repository.MemberRepository;
import ku.cs.prize.repository.PrizeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PrizeService {
    @Autowired
    private PrizeRepository prizeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MemberRepository memberRepository;

    public List<Prize> getAllPrizes() {return prizeRepository.findAll();}

    public Prize getOneById(UUID id){return prizeRepository.findById(id).get();}

    public void createNewPrize(PrizeRequest prize){
        Prize record = modelMapper.map(prize, Prize.class);
        prizeRepository.save(record);
    }

}
