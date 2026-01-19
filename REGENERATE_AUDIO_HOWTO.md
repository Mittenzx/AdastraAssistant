# How to Regenerate Audio Files

This guide explains how to regenerate all 34 audio files with the Hitagi-inspired voice model.

## Quick Start: Use GitHub Actions (Recommended)

The easiest way to regenerate the audio files is using the GitHub Actions workflow:

### Steps:

1. **Go to the Actions tab** in your GitHub repository
   - Navigate to: `https://github.com/Mittenzx/AdastreaAssistant/actions`

2. **Find the workflow**
   - Look for "Regenerate Audio Files" in the left sidebar
   - Click on it

3. **Run the workflow**
   - Click the "Run workflow" button (top right)
   - Select the branch (usually `main` or your current branch)
   - Optionally customize the commit message
   - Click the green "Run workflow" button

4. **Monitor progress**
   - The workflow will take approximately 5-10 minutes
   - You can watch progress in real-time
   - A summary will be provided when complete

5. **Review results**
   - Check the generated audio files in `src/main/resources/audio/`
   - A backup of previous files is available as a workflow artifact (for 30 days)

### What the Workflow Does:

✅ Sets up Python 3.11 environment  
✅ Installs TTS library and dependencies  
✅ Creates automatic backup of current audio  
✅ Regenerates all 34 audio files:
   - 6 greetings
   - 16 dialogue samples (hostile, curious, cooperative)
   - 7 notifications
   - 5 sound effects

✅ Applies Hitagi-inspired voice characteristics:
   - Lower-medium pitch (8% reduction)
   - Measured delivery (10-15% slower)
   - Crisp articulation
   - Strategic pauses (20-30% longer)
   - Controlled emotional expression

✅ Validates generated files  
✅ Commits and pushes changes automatically

### Backup Access:

If you need to restore previous audio files:
1. Go to the workflow run that regenerated the files
2. Scroll down to "Artifacts"
3. Download "audio-backup" (available for 30 days)
4. Extract and restore as needed

---

## Alternative: Local Regeneration

If you prefer to regenerate files locally, see `docs/AUDIO_REGENERATION_NOTES.md` for detailed instructions on setting up:
- Python 3.9-3.11 with pyenv
- Conda environment
- Docker (requires network access)

---

## Troubleshooting

### Workflow fails with "TTS library not found"
- This shouldn't happen as dependencies are installed automatically
- Check the workflow logs for specific error messages

### Workflow fails with network errors
- The workflow requires internet access to download TTS models
- Ensure GitHub Actions has network access enabled

### Audio quality issues
- See `docs/VOICE_MODEL_TARGET.md` for troubleshooting voice characteristics
- Adjust parameters in `scripts/tts_generate_human.py` if needed
- Re-run the workflow after making changes

### Need to test changes first
- Use local regeneration to test parameter changes
- Once satisfied, commit changes and run the workflow

---

## Next Steps After Regeneration

1. **Listen to samples** to verify voice quality
2. **Test in-game** with AudioManager
3. **Gather feedback** from users
4. **Iterate** if needed by adjusting parameters and re-running

---

## Support

For more information:
- **Complete regeneration guide**: `docs/AUDIO_REGENERATION_NOTES.md`
- **Voice model specification**: `docs/VOICE_MODEL_TARGET.md`
- **Audio validation report**: `docs/AUDIO_VALIDATION_REPORT.md`
- **TTS quickstart**: `docs/QUICKSTART_HUMAN_AUDIO.md`

---

**Last Updated**: January 19, 2026  
**Status**: Ready to use
