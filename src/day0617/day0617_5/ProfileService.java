package day0617.day0617_5;

public class ProfileService {
    ProfileRepository profileRepository;

    public void saveProfile(ProfileRepository profileRepository) {
        profileRepository.save();
    }

    public void deleteProfile(ProfileRepository profileRepository) {
        profileRepository.delete();
    }
}
